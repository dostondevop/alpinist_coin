package uz.AlpinistEdu_Service.service;

import uz.AlpinistEdu_Service.model.connections.TeacherGroup;

import java.util.List;
import java.util.UUID;

public class TeacherGroupService implements BaseService<TeacherGroup> {
    @Override
    public TeacherGroup add(TeacherGroup teacherGroup) {
        return null;
    }

    @Override
    public TeacherGroup get(UUID id) {
        return null;
    }

    @Override
    public boolean has(TeacherGroup teacherGroup, List<TeacherGroup> list) {
        return false;
    }

    @Override
    public TeacherGroup getById(UUID id) {
        return null;
    }

    @Override
    public List<TeacherGroup> getList() {
        return List.of();
    }

    @Override
    public List<TeacherGroup> read() {
        return List.of();
    }

    @Override
    public void write(List<TeacherGroup> teacherGroups) {

    }
}