package com.sample.studentregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.studentregister.dao.HostelDAO;
import com.sample.studentregister.model.Hostel;
import com.sample.studentregister.repository.HostelRepository;

@Service
public class HostelService {

	@Autowired
	private HostelRepository hostelRepo;

	public List<Hostel> getAllHostels() {
		return hostelRepo.findAll();
	}

	public Hostel GetHostelById(Long id) {

		return hostelRepo.findById(id).orElse(null);
	}

	public Hostel createHostel(HostelDAO hostelDao) {
		Hostel hostel = new Hostel();		
		hostel.setHostelName(hostelDao.getHostelName());
		hostel.setCookList(hostelDao.getCookList());
		hostel.setHostelAddress(hostelDao.getHostelAddress());
		hostel.setMatron(hostelDao.getMatron());
		hostel.setServentList(hostelDao.getServentList());
		hostel.setScavengerList(hostelDao.getScavengerList());

		return hostelRepo.save(hostel);
	}

	public Hostel updateHostel(Long hostelId, HostelDAO hostelDao) {
		Hostel hostel = hostelRepo.findById(hostelId).orElse(null);
		if (hostel != null) {
			hostel.setHostelName(hostelDao.getHostelName());
			hostel.setCookList(hostelDao.getCookList());
			hostel.setHostelAddress(hostelDao.getHostelAddress());
			hostel.setMatron(hostelDao.getMatron());
			hostel.setServentList(hostelDao.getServentList());
			hostel.setScavengerList(hostelDao.getScavengerList());
			hostelRepo.save(hostel);
		}
		return hostel;
	}

	public Hostel deleteHostelById(Long id) {
		Hostel deletedHostel = hostelRepo.findById(id).orElse(null);
		if(deletedHostel!=null) {
			hostelRepo.deleteById(id);
		}
		return deletedHostel;
	}
}
