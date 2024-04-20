package com.example.QhalaHackathon.implementation;

import com.example.QhalaHackathon.entity.doctor;
import com.example.QhalaHackathon.repository.doctor_repository;
import com.example.QhalaHackathon.repository.hospital_repository;
import com.example.QhalaHackathon.service.doctor_service;
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
public class doctor_implementation implements doctor_service {

    @Autowired
    @Qualifier("doctor_repository")
    private doctor_repository doctorRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends doctor> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends doctor> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<doctor> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public doctor getOne(Long aLong) {
        return null;
    }

    @Override
    public doctor getById(Long aLong) {
        return null;
    }

    @Override
    public doctor getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends doctor> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends doctor> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends doctor> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends doctor> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends doctor> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends doctor> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends doctor, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends doctor> S save(S entity) {
        return doctorRepository.save(entity);
    }

    @Override
    public <S extends doctor> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<doctor> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<doctor> findAll() {
        return null;
    }

    @Override
    public List<doctor> findAllById(Iterable<Long> longs) {
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
    public void delete(doctor entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends doctor> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<doctor> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<doctor> findAll(Pageable pageable) {
        return null;
    }
}
