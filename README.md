# Baigiamasis darbas
Pasirinkta testuoti svetainė: https://www.siusk24.lt/LT

# Test:
1. Test price count function:

    (priceCountFunction)

* Select the city of deparcher from the dropdown list *"Paėmimas iš"*;( select Lietuva )
* enter text in input field *"Pašto kodas"*; ( enter "92219")
* Select the city of arival from the dropdown list *"Pristatymas į"*;(select Lietuva)
* enter text in destination input field *"Pašto kodas"*; ( enter "92211") *enter the length  in input field "Ilgis";(enter 30)
* enter the wide in input field *"Plotis"*;(enter 15)
* enter the hight in input field *"Aukštis"*;(enter 100)
* enter the weight in input field *"Svoris"*;(enter 2)
* click search icon;(Skaičiuoti kainą)
* Expected result;(  all fields contains entered information)

# Test:

2.Log in with non-existing account information

(tryToLogInwithNonExistingAccointInfo)

* Open log in page (*"Prisijungti"*)
* Input email(test@test.com) and password(password)
* Click *"Prisijungti"* button
* Expected result: alert message is *"Pamirsote slaptazodi?"*


# Test
3.Log in with existing account information

(tryToLogInWithExistingAccountInfo)

* Try to log in with existing account information
* Open log in page
* press button *"Prisijungti"*
* Input email (project2022vcs@gmail.com) and password(Passwordvcs)
* Click *"Prisijungti"* button
* Expected result : allert message is  *"Tapatybės patvirtinimas"*



# Test
4.  User Log out

     (userLogOut)

* Click on field *"Vardenis Pavardenis"* right upper corner
* Select *"Atsijungti"*
* Click on field *"Atsijungti"*

Expected result : redirected to the main page , appears  option *"Prisijungti"*

# Test
5. Parcel search

   (parselSearch)

* click on *"Paslaugos"*
  *click on *"Siuntu sekimas ir siuntu paieska"*
* enter parcel tracking number in input field *"Paieska"*; (enter S24C0909170369 )
  *click on button magnifying glass"Lupa"
  Expected result: alert message is "0 rezultatų pagal raktažodi S240909662681"

