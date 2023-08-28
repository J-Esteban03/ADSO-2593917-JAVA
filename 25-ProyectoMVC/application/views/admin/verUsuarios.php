<?php 
$dataHeader['titulo'] = "Ver Usuarios";
$this->load->view('layouts/header', $dataHeader);
?>
<?php 
$dataSidebar['session'] = $session;
$dataSidebar['optionSelected'] = 'openListUsers';
$this->load->view('layouts/sidebar', $dataSidebar);
?>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
  <div class="col-12 m-0 p-3">
    <h1 class="text-primary text-center">TABLA CON LISTA DE USUARIOS</h1>
    
    <table class="table table-bordered">
      <thead>
        <tr>
          <th>Nombre de usuario</th>
          <th>Correo electrónico</th>
        </tr>
      </thead>
      <tbody>
        <?php
        
        ?>
      </tbody>
    </table>
    
  </div>
</div>
<?php 
$this->load->view('layouts/footer');
?>
