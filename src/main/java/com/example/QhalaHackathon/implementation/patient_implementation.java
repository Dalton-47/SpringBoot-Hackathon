package com.example.QhalaHackathon.implementation;

import com.example.QhalaHackathon.entity.patient;
import com.example.QhalaHackathon.repository.hospital_repository;
import com.example.QhalaHackathon.repository.patient_repository;
import com.example.QhalaHackathon.service.hospital_service;
import com.example.QhalaHackathon.service.patient_service;
import org.springframework.beans.factory.annotation.Autowired;
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
public class patient_implementation implements patient_service{

    @Autowired
    patient_repository patient_repository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends patient> S saveAndFlush(S entity) {
        return entity;
    }

    @Override
    public <S extends patient> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<patient> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public patient getOne(Long aLong) {
        return null;
    }

    @Override
    public patient getById(Long aLong) {
        return patient_repository.getById(aLong);
    }

    @Override
    public patient getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends patient> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends patient> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends patient> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends patient> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends patient> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends patient> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends patient, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends patient> S save(S entity) {
        return patient_repository.save(entity);
    }

    @Override
    public <S extends patient> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<patient> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<patient> findAll() {
        List<patient> patients = patient_repository.findAll();

        // Logging the retrieved patients
        System.out.println("Retrieved patients: " + patients);

        return patients;
    }

    @Override
    public List<patient> findAllById(Iterable<Long> longs) {
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
    public void delete(patient entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends patient> entities) {

    }

    @Override
    public void deleteAll() {


    }

    @Override
    public List<patient> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<patient> findAll(Pageable pageable) {
        return null;
    }


    @Override
    public Optional<patient> findByidentificationNumber(String identificationNumber) {
        return patient_repository.findByidentificationNumber(identificationNumber);
    }





}
