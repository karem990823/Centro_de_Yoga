# ACTIVIDAD 1
Identificacion de objetos de un centro de yoga.

---

**Ejemplo:**
```
Objeto: Clase de Yoga
- ¿Qué es?: Una sesión programada de yoga o meditación
- Características: código, tipo de clase, instructor, horario, cupo, duración
- Comportamientos: agendar clase, inscribir estudiante, verificar cupo, confirmar asistencia
```
---

## OBJETO 1: CENTRO DE YOGA

- **¿Qué es?:** La entidad principal que representa el negocio "Equilibrio y Bienestar".
- **Características:** nombre centro, dirección, email, celular, listas de clases, listas de instructores, lista de estudiantes.
- **Comportamientos:** añadir clase, añadir instructor, inscribir estudiante, generar_reporte_ingresos, gestionar_inventario_tienda.

---

## OBJETO 2: ESTUDIANTE

- **¿Qué es?:** Persona que asiste a las sesiones de yoga, meditación o pilates.
- **Características:** nombre estudiante, identificación, email, celular, historial de clase.
- **Comportamientos:** confirmar asistencia, agendar clases, cancelar clases, consultar historial.

---

## OBJETO 3: INSTRUCTOR

- **¿Qué es?:** profesional certificado que imparte las sesiones en el centro de yoga.
- **Características:** nombre instructor, identificación, email, celular, nombre clase, horario, historial de clases impartidas, certificaciones.
- **Comportamientos:**  impartir clases, asignar clases, registrar asistencia, actualizar disponibilidad.

---

## OBJETO 4: TERAPIA HOLISTICA

- **¿Qué es?:** Un servicio individualizado de bienestar ofrecido por el centro.
- **Características:** nombre tarapia, descripción, instructor asignado, duración, horario disponible.
- **Comportamientos:** agendar_cita, asignar_terapeuta, confirmar_cita, cancelar_cita, registrar_sesión.

---

## OBJETO 5: SALA DE YOGA

- **¿Qué es?:** Espacio físico donde se imparten las clases
- **Características:** nombre sala, capacidad maxima, equipo disponible, disponibilidad
- **Comportamientos:** reservar sala, verificar disponibilidad, reportar mantenimiento, asignar a clase.
