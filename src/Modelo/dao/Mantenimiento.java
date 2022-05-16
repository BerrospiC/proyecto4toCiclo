/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import java.util.List;

/**
 *
 * @author PERSONAL
 */
public interface Mantenimiento {
    public int Agregar(Object[] object);

    public List Listar();

    public int Actualizar(Object[] object);

    public void Eliminar(int id);
}
