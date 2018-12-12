<link rel="stylesheet" href="css.css">
<form action="" method="get">
    <input type="text" name="search">
    <input type="submit">

</form>

<form action="" method="get">
    <input type="submit" value="name" name="order">
    <input type="submit" value="price" name="order">
</form>
<table>
    <?php
    
    session_start();
    require("templates/meny.php");
  //  require("templates/head.php");
    
$search="";
if(isset($_GET['search'])){
    $search = $_GET['search'];
    
} 
  
$order ="";
    if(isset($_GET['order'])){
        if(isset($_SESSION['order'])&& $_GET['order'] == $_SESSION['order']){
            $order = "ORDER BY " . $_GET ['order'] . " DESC";
            $_SESSION['order'] = "";
        }
        else{
            $order = "ORDER BY " . $_GET['order'] . " ASC";
            $_SESSION['order'] = $_GET['order'];
        }
       
    }
    


$dbc = mysqli_connect("localhost","root","","form");
    
$query = "SELECT * FROM skor WHERE name LIKE '$search%' OR price LIKE '%$search%' $order";
    
    $result = mysqli_query($dbc,"SET NAMES UTF8");
$result = mysqli_query($dbc,$query);

while($row = mysqli_fetch_array($result)){
    ?>
    <div class="container">
        <h1 class="name">
            <?php echo $row['name']; ?>
        </h1>
        <h1 class="price">
            <?php echo $row['price']; ?>
        </h1>
       
    </div>


    <?php
    
    
}


?>
</table>
