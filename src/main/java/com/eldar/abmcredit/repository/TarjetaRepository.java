package com.eldar.abmcredit.repository;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
    List<Tarjeta> findByUsuarioId(Long usuarioId);
}
