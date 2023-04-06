const formularioLogin = (req, res) => {
  res.render("auth/login", {
    pagina: 'Iniciar Sesión'
  });
};

const formularioRegistro = (req, res) => {
  res.render("auth/registro", {
    pagina: 'Crear Cuenta'
  });
};

const registrar = (req, res) => {
  console.log('Registrando')
};

const formularioOlvidePassword = (req, res) => {
  res.render("auth/olvide-password", {
    pagina: 'Recuperar tu acceso a Bienes Raices'
  });
};

export { 
  formularioLogin, 
  formularioRegistro,
  registrar,
  formularioOlvidePassword
};
