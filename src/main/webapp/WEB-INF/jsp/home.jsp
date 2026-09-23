<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-4.0.0.js"></script>

        <title>Pilotage</title>

    </head>
    <body>
        <div class="container">
            <h1>Spring Web Flow is working</h1>

            <h3 id="nopers">AZYYXVBNFHYERSD</h3>
        </div>



        <div class="modal fade" id="loadingModal" tabindex="-1" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content border-0 bg-transparent shadow-none">
                    <div class="modal-body text-center">
                        <div class="spinner-border text-primary" role="status" style="width: 3rem; height: 3rem;">
                            <span class="visually-hidden"> Chargement... </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>
            $(document).ready(function(){
              console.log('ready method');
              $('#loadingModal').modal('show');

              $.ajax({
                type: 'POST',
                url: '${pageContext.request.contextPath}/fetchData?_csrf=${_csrf.token}',
                data: { nopermis: 'AZ2987234' },
                success: function(liste)
                {
                    console.log('Controller executed successfully');
                    console.log('Response from controller:', liste);


                    $('#loadingModal').modal('hide');
                    $('#nopers').text(liste);
                },
                error: function(jqXHR, textStatus, errorThrown)
                {
                    console.error('Controller error');
                    console.error('HTTP status:', jqXHR.status);
                    console.error('Error:', errorThrown);
                    //loadingModal.hide();
                    $(document.body).append( '<p class="text-danger">Error: ' + jqXHR.status + '</p>' );
                }
            });

            });
        </script>

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
