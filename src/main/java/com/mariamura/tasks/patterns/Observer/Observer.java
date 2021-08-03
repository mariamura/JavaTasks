package com.mariamura.tasks.patterns.Observer;

import java.util.List;

public interface Observer {
    void handleUpdate(List<Skill> skillList);
}
