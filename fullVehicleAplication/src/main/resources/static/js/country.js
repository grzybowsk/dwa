$('document').ready(function() {

    $('.table #editButton').on('click',function(event){
        event.preventDefault();

        var href= $(this).attr('href');

        $.get(href, function(country, status){
            $('#idEdit').val(country.id);
            $('#descriptionEdit').val(country.description);
            $('#capitalEdit').val(country.capital);
            $('#codeEdit').val(country.code);
            $('#nationalityEdit').val(country.nationality);
            $('#continentEdit').val(country.continent);

        });
        $('#editModal').modal();
    });


    $('.table #deleteButton').on('click',function(event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal();
    });
});