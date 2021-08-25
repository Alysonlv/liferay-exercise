package com.alv.liferay.exercise.api;

import com.alv.liferay.exercise.model.ExForm;
import org.springframework.stereotype.Service;
import sun.text.resources.FormatData;

import java.util.Set;

@Service
public class FormService implements CrudService<ExForm, Long> {

    final private FormatData formatData;

    public FormService(final FormatData formatData) {
        this.formatData = formatData;
    }

    @Override
    public Set<ExForm> findAll() {
        return null;
    }

    @Override
    public ExForm findById(Long aLong) {
        return null;
    }

    @Override
    public ExForm save(ExForm object) {
        return null;
    }

    @Override
    public void delete(ExForm object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
