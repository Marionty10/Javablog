package javablog.bindingModel;

import java.util.ArrayList;
import java.util.List;

public class UserEditBindModel extends UserBindingModel{
    private List<Integer> roles;
    public UserEditBindModel() { this. roles = new ArrayList<>(); }
    public List<Integer> getRoles() { return roles; }
    public void setRoles (List <Integer> roles ) { this. roles = roles ; }}


