/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources.repositories;

import br.com.diagnosticit.resources.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cristianoca
 */
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
