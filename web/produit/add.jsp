<jsp:include page="../header.jsp"></jsp:include>
<div class="row">

    <!-- Area Chart -->
    <div class="col-xl-8 col-lg-7">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Liste des Produits</h6>

            </div>
            <!-- Card Body -->
            <div class="card-body">
                Tableau
            </div>
        </div>
    </div>

    <!-- Pie Chart -->
    <div class="col-xl-4 col-lg-5">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Ajout de Produit</h6>

            </div>
            <!-- Card Body    -->
            <div class="card-body">

                <div id="message" class="alert alert-succes">Produit  ajouter avec succes</div>




                <form method="post" action="Produit">
                    <div class="form-group">
                        <label>Nom du produit</label>
                        <input class="form-control" type="text" name="nom"/>
                    </div>
                    <div class="form-group">
                        <label>Quantité en Stock du Produit</label>
                        <input class="form-control" type="text" name="qtStock"/>
                    </div>
                    <div>
                         <input class="btn  btn-success"type="submit" value="Envoyer "/>
                    </div>
                </form>


            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function(){
        $(#message).show().fadeOut(15000).css("color","blue");
    });

</script>
<jsp:include page="../footer.jsp"></jsp:include>