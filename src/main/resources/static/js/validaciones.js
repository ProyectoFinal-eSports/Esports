var usuarioCorrecto = false;
var nombreCorrecto = false;
var apellidoCorrecto = false;
var emailCorrecto = false;
var claveCorrecto = false;

function comprobarUsuario() {
  usuario = document.registro.usuario;
  var validacion = /^[a-z0-9]{6,20}$/;
  if (validacion.test(usuario.value.trim())) {
    usuarioCorrecto = true;
    usuario.style.color = "blue";
  } else {
    usuarioCorrecto = false;
    usuario.style.color = "red";
  }
}

function comprobarNombre() {
  nombre = document.registro.nombre;
  var validacion = /^[A-ZÑÇÁÉÍÓÚ]{2}((( |\-)?([A-ZÑÇÁÉÍÓÚ]){1,})){0,}$/;
  if (validacion.test(nombre.value.trim().toUpperCase())) {
    if (
      nombre.value.trim().toUpperCase().length <= 20 &&
      nombre.value.trim().toUpperCase().length >= 2
    ) {
      nombreCorrecto = true;
      nombre.style.color = "blue";
    } else {
      nombreCorrecto = false;
      nombre.style.color = "red";
    }
  } else {
    nombreCorrecto = false;
    nombre.style.color = "red";
  }
}

function comprobarApellido() {
  apellido = document.registro.apellido;
  var validacion = /^[A-ZÑÇÁÉÍÓÚ]{2}((( |\-)?([A-ZÑÇÁÉÍÓÚ]){1,})){0,}$/;
  if (validacion.test(apellido.value.trim().toUpperCase())) {
    if (
      apellido.value.trim().toUpperCase().length <= 30 &&
      apellido.value.trim().toUpperCase().length >= 2
    ) {
      apellidoCorrecto = true;
      apellido.style.color = "blue";
    } else {
      apellidoCorrecto = false;
      apellido.style.color = "red";
    }
  } else {
    apellidoCorrecto = false;
    apellido.style.color = "red";
  }
}

function comprobarCorreo() {
  email = document.registro.email;
  var validacion = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/;
  if (validacion.test(email.value)) {
    emailCorrecto = true;
    email.style.color = "blue";
  } else {
    emailCorrecto = false;
    email.style.color = "red";
  }
}

function comprobarClave() {
  clave1 = document.registro.clave1;
  clave2 = document.registro.clave2;
  var validacion =
    /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?_&])([A-Za-z\d$@$!%*?_&]|[^ ]){8,15}$/;
  if (validacion.test(clave1.value)) {
    claveCorrecto = true;
    clave1.style.color = "blue";
  } else {
    claveCorrecto = false;
    clave1.style.color = "red";
  }
  if (clave1 != clave2 || clave1 == "") {
    claveCorrecto = false;
  }
}

function limpiarFormulario() {
  document.getElementById("registroForm").reset();
}

$(document).ready(function(){
   $('.confirmation').on('click', function () {
        return confirm('¿ Estás seguro ?');
    });
});