<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Wire Resistance Calculator-fengliu</title>
        <script type="text/javascript">
            var n1=document.getElementById("length").value;
            var n2=document.getElementById("area").value;
            var x = document.getElementById("materials").value;
            console.log(typeof n1); 
            
            function btn(){
          
                         alert(parseFloat(document.getElementById("length").value)/parseFloat(document.getElementById("area").value)*parseFloat(document.getElementById("materials").value)+ "(ohm m)");
            }
        </script>
    </head>
    <label for="materials">Choose a material:</label>
    <select id="materials" >
        <option value="0.0000000168">copper</option>
        <option value="0.0000000159">silver</option>
        <option value="0.0000000971">iron</option>
        <option value="0.0000000106">Platinum</option>
        <option value="0.0000000482">Manganin</option>
        <option value="0.000000056">tungsten</option>
        <option value="0.0000000265">aluminum</option>
    </select>
    <body>
        <p>please type in: </p>
        <form action="index.html" method="get">
            length(cm)
            <input type="text" id="length" value="" />
            area(cm^2)
            <input type="text" id="area" value="" />
            <button type="button" onclick="btn();">Submit</button>
        </form>
    </body>
</html>
