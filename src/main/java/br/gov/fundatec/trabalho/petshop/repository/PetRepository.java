package br.gov.fundatec.trabalho.petshop.repository;

import br.gov.fundatec.trabalho.petshop.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
