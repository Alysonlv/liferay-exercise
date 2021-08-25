package com.alv.liferay.exercise.data;

import com.alv.liferay.exercise.model.ExForm;
import javafx.beans.binding.ObjectExpression;
import org.springframework.stereotype.Repository;

@Repository
public class FormDAOImpl implements FormDAO {

    private final Object connection = ConnectionFactory.createDataBaseConnection();

    @Override
    public ExForm createUpdate(ExForm form) throws Exception {

        //Send message if successful
        return null;
    }

    @Override
    public ExForm findById(long id) {
        return null;
    }

    @Override
    public ExForm search(ExForm form) {
        return null;
    }
}
