package com.kgc.service;

import com.kgc.pojo.Credentialtype;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 19:48
 */
public interface CredentialtypeService {
    List<Credentialtype> cList();

    List<Credentialtype> cList(Integer id);
}
