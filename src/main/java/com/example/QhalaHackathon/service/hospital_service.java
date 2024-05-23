package com.example.QhalaHackathon.service;

import com.example.QhalaHackathon.model.Hospital;
import com.example.QhalaHackathon.repository.hospital_repository;
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
public class hospital_service implements hospital_repository {

    @Autowired
    @Qualifier("hospital_repository")
    private hospital_repository hospitalRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Hospital> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Hospital> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Hospital> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Hospital getOne(Long aLong) {
        return null;
    }

    @Override
    public Hospital getById(Long aLong) {
        return null;
    }

    @Override
    public Hospital getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Hospital> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Hospital> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Hospital> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Hospital> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Hospital> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Hospital> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Hospital, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Hospital> S save(S entity) {
        return hospitalRepository.save(entity);
    }

    @Override
    public <S extends Hospital> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Hospital> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Hospital> findAll() {
        return null;
    }

    @Override
    public List<Hospital> findAllById(Iterable<Long> longs) {
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
    public void delete(Hospital entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Hospital> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Hospital> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Hospital> findAll(Pageable pageable) {
        return null;
    }
}
