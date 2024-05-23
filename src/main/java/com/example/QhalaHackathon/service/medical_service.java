package com.example.QhalaHackathon.service;

import com.example.QhalaHackathon.model.MedicalHistory;
import com.example.QhalaHackathon.repository.medical_repository;
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
public class medical_service implements medical_repository {

    @Autowired
    @Qualifier("medical_repository")
    private medical_repository medicalRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends MedicalHistory> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MedicalHistory> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<MedicalHistory> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MedicalHistory getOne(Long aLong) {
        return null;
    }

    @Override
    public MedicalHistory getById(Long aLong) {
        return null;
    }

    @Override
    public MedicalHistory getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends MedicalHistory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MedicalHistory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends MedicalHistory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends MedicalHistory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MedicalHistory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MedicalHistory> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MedicalHistory, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends MedicalHistory> S save(S entity) {
        return medicalRepository.save(entity);
    }

    @Override
    public <S extends MedicalHistory> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MedicalHistory> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<MedicalHistory> findAll() {
        return null;
    }

    @Override
    public List<MedicalHistory> findAllById(Iterable<Long> longs) {
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
    public void delete(MedicalHistory entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends MedicalHistory> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<MedicalHistory> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<MedicalHistory> findAll(Pageable pageable) {
        return null;
    }
}
