package com.example.QhalaHackathon.implementation;

import com.example.QhalaHackathon.entity.medical_history;
import com.example.QhalaHackathon.repository.hospital_repository;
import com.example.QhalaHackathon.repository.medical_repository;
import com.example.QhalaHackathon.service.medical_service;
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
public class medical_implementation implements medical_service {

    @Autowired
    @Qualifier("medical_repository")
    private medical_repository medicalRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends medical_history> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends medical_history> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<medical_history> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public medical_history getOne(Long aLong) {
        return null;
    }

    @Override
    public medical_history getById(Long aLong) {
        return null;
    }

    @Override
    public medical_history getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends medical_history> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends medical_history> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends medical_history> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends medical_history> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends medical_history> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends medical_history> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends medical_history, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends medical_history> S save(S entity) {
        return medicalRepository.save(entity);
    }

    @Override
    public <S extends medical_history> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<medical_history> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<medical_history> findAll() {
        return null;
    }

    @Override
    public List<medical_history> findAllById(Iterable<Long> longs) {
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
    public void delete(medical_history entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends medical_history> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<medical_history> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<medical_history> findAll(Pageable pageable) {
        return null;
    }
}
