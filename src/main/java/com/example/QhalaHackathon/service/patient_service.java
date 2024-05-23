package com.example.QhalaHackathon.service;

import com.example.QhalaHackathon.model.Patient;
import com.example.QhalaHackathon.repository.patient_repository;
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
public class patient_service implements patient_repository {

    @Autowired
    patient_repository patient_repository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends Patient> S saveAndFlush(S entity) {
        return entity;
    }

    @Override
    public <S extends Patient> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Patient> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Patient getOne(Long aLong) {
        return null;
    }

    @Override
    public Patient getById(Long aLong) {
        return patient_repository.getById(aLong);
    }

    @Override
    public Patient getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Patient> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Patient> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Patient> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Patient> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Patient> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Patient> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Patient, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Patient> S save(S entity) {
        return patient_repository.save(entity);
    }

    @Override
    public <S extends Patient> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Patient> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> patients = patient_repository.findAll();

        // Logging the retrieved patients
        System.out.println("Retrieved patients: " + patients);

        return patients;
    }

    @Override
    public List<Patient> findAllById(Iterable<Long> longs) {
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
    public void delete(Patient entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Patient> entities) {

    }

    @Override
    public void deleteAll() {


    }

    @Override
    public List<Patient> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Patient> findAll(Pageable pageable) {
        return null;
    }


    @Override
    public Optional<Patient> findByidentificationNumber(String identificationNumber) {
        return patient_repository.findByidentificationNumber(identificationNumber);
    }





}
