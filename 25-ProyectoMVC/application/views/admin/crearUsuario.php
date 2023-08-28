<?php 
$dataHeader['titulo'] = "Crear Usuarios";
$this->load->view('layouts/header', $dataHeader);
?>
<?php 
$dataSidebar['session'] = $session;
$dataSidebar['optionSelected'] = 'openCreateUser';
$this->load->view('layouts/sidebar', $dataSidebar);
?>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
  <div class="col-12 m-0 p-3">
    <h1 class="text-primary text-center">FORMULARIO CREACIÓN DE USUARIO</h1>
    
    <form action="crear_usuario.php" method="post">
      <div class="form-group">
        <label for="username">Nombre de usuario:</label>
        <input type="text" id="username" name="username" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="email">Correo electrónico:</label>
        <input type="email" id="email" name="email" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" class="form-control" required>
      </div>
      <button type="submit" class="btn btn-primary">Crear Usuario</button>
    </form>
    
  </div>
</div>
<?php 
$this->load->view('layouts/footer');
?>
