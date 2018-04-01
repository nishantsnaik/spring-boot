package io.nishant.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.nishant.api.entity.User;
import io.nishant.api.exception.BadRequestException;
import io.nishant.api.exception.NotFoundException;
import io.nishant.api.repository.UserRepository;
import io.nishant.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository repository;

	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public User findOne(String id) {
		return repository.findOne(id)
				.orElseThrow(() -> new NotFoundException("User with id: " + id + " does not exist."));

	}

	@Override
	@Transactional
	public User create(User user) {
		Optional<User> existing = repository.findByEmail(user.getEmail());
		if (existing.isPresent()) {
			throw new BadRequestException("User with email: " + user.getEmail() + " already exist.");
		}

		return repository.save(user);
	}

	@Override
	@Transactional
	public User update(String id, User user) {
		repository.findOne(id).orElseThrow(() -> new NotFoundException("User with id: " + id + " does not exist."));
		return repository.save(user);
	}

	@Override
	@Transactional
	public void delete(String id) {
		User existing = repository.findOne(id)
				.orElseThrow(() -> new NotFoundException("User with id: " + id + " does not exist."));
		repository.delete(existing);
	}

}
