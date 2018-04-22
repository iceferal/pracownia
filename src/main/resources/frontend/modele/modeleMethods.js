$(function(){
    $('.add').click(function(){
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/model",
            type: "Post",
            data: JSON.stringify({
                "nazwa": document.getElementById("nazwa").value,
                "produkcja_od": document.getElementById("produkcja_od").value,
                "produkcja_do": document.getElementById("produkcja_do").value,
                "masa": document.getElementById("masa").value
            }),
            success: function(){
                alert("Dodano model");
            },
            error: function () {
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/model/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function () {
                if (!alert("Usunieto model")) {
                    window.location.reload();
                }
            },
            error: function(){
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
});