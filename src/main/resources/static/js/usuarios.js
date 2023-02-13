// Call the dataTables jQuery plugin
$(document).ready(function() {
  alert("Esto es una prueba de javascript");
  cargaUsuarios();
  $('#usuarios').DataTable();
});

async function cargaUsuarios() {

  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();

   let listadoHTML = '';
   for (let usuario of usuarios) {
      let botonEliminar ='<a onclick="eliminarUsuario('+ usuario.id +')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'
      let usuarioHTML= '<tr><td>'+usuario.id+
                       '<td>'+usuario.nombre+
                       '</td><td>'+usuario.email+
                       '</td><td>'+usuario.telefono+
                       '</td><td>'+botonEliminar+'</td><tr>';
   listadoHTML += usuarioHTML;
   }

  console.log(usuarios);

  document.querySelector('#usuarios tbody').outerHTML = listadoHTML;
}

 async function eliminarUsuario(id){
  if (!confirm('¿Desea eliminar este usuario?')) {
    return;
  }
  const request = await fetch('api/eliminar/' + id, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    location.reload();
}