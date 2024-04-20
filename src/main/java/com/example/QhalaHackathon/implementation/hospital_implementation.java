package com.example.QhalaHackathon.implementation;

import com.example.QhalaHackathon.entity.hospital;
import com.example.QhalaHackathon.repository.hospital_repository;
import com.example.QhalaHackathon.service.hospital_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class hospital_implementation implements hospital_service {

    @Autowired
    @Qualifier("hospital_repository")
    private hospital_repository hospitalRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends hospital> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends hospital> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<hospital> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public hospital getOne(Long aLong) {
        return null;
    }

    @Override
    public hospital getById(Long aLong) {
        return null;
    }

    @Override
    public hospital getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends hospital> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends hospital> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends hospital> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends hospital> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends hospital> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends hospital> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends hospital, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends hospital> S save(S entity) {
        return hospitalRepository.save(entity);
    }

    @Override
    public <S extends hospital> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<hospital> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<hospital> findAll() {
        return null;
    }

    @Override
    public List<hospital> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(hospital entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends hospital> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<hospital> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<hospital> findAll(Pageable pageable) {
        return null;
    }
}
