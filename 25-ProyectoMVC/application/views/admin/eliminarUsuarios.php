<?php 
$dataHeader['titulo'] = "Eliminar Usuarios";
$this->load->view('layouts/header', $dataHeader);
?>
<?php 
$dataSidebar['session'] = $session;
$dataSidebar['optionSelected'] = 'openDeleteUser';
$this->load->view('layouts/sidebar', $dataSidebar);
?>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
  <div class="col-12 m-0 p-3">
    <h1 class="text-primary text-center">FORMULARIO PARA BUSCAR Y ELIMINAR DE USUARIO</h1>

    <form action="eliminar_usuario.php" method="post">
      <div class="form-group">
        <label for="searchUsername">Nombre de usuario:</label>
        <input type="text" id="searchUsername" name="searchUsername" class="form-control" required>
      </div>
      <button type="submit" class="btn btn-primary">Buscar Usuario</button>
    </form>
    
  </div>
</div>
<?php 
$this->load->view('layouts/footer');
?>
