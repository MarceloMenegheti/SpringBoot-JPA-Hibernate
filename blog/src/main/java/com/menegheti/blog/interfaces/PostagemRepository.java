package com.menegheti.blog.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menegheti.blog.entities.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer>{
// com esta simples interface podemos dazer as quatro operações na classe Postagem
//consulta, cadastro, edição, e exclusão
}
