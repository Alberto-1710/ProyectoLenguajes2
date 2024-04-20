package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;

import hn.unah.lenguajes1900.proyectolenguajes.services.impl.ReporteServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/reporte")

public class ReporteController {
    @Autowired
    private  ReporteServiceImpl reporteServiceImpl;
   

    public ReporteController(ReporteServiceImpl reporteServiceImpl) {
        this.reporteServiceImpl = reporteServiceImpl;
    }

    @GetMapping("/pedidos-por-fecha")
    public ResponseEntity<List<Pedidos>> generarReportePedidosPorFecha(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        List<Pedidos> pedidos = reporteServiceImpl.obtenerPedidosPorFecha(fecha);
        if (pedidos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pedidos);
    }
}

