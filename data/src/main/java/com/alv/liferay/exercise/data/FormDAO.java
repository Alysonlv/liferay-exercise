package com.alv.liferay.exercise.data;

import com.alv.liferay.exercise.model.ExForm;

public interface FormDAO {

    public ExForm createUpdate(final ExForm form) throws Exception;
    public ExForm findById(final long id);
    public ExForm search(final ExForm form);

}
