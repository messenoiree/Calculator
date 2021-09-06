##Uppgift 2
<ins>Förekomst av en klass</ins>  
Ett exempel på förekomsten av en klass i vårt projekt är Operations-klassen. I denna klass ligger alla de metoder som sköter själva uträkningarna efter det att användaren valt menyval och angett de tal hen vill genomföra uträkningar med.

<ins>Förekomst av en metod</ins>  
Vi har en Main-metod där vi har en Switch-sats. Beroende på användarens menyval så anropas en metod för det valda räknesättet. Dessa metoder tar in användarens inmatade tal.

För varje räknesätt så har vi sedan även enskilda metoder, i Operations-klassen, som tar in de nummer som användaren väljer att hen vill göra uträkningar med. Uträkningarna genomförs och resultatet returneras sedan.

<ins>Förekomst av primitiv datatyp</ins>  
Ett exempel på en primitiv datatyp i vårt projekt är den boolean som hanterar körningen av While-loopen som Switch-satsen ligger i, i Main-metoden.

Inuti de metoder som tar emot användarens inmatade tal från terminalen har vi även double-variabler som lagrar dessa värden för att sedan användas för att skriva ut resultatet av uträkningarna.

I Operations-klassen så returnerar varje metod en primitiv datatyp, i form av en double.

<ins>Förekomst av ett objekt</ins>  
Ett exempel på förekomsten av ett objekt i vårt projekt är då vi skapar en instans (ett objekt) av Scanner-klassen. Vi använder sedan detta objekt för att ta in, och lagra användarens inmatning från terminalen.

<ins>Hur vi gick tillväga för att identifiera de existerande felen och korrigera dessa</ins>  
Vi började med att clona ner projektet och ändra så att vi kunde pusha till vår egna repository. Där efter tittade vi igenom projektet och diskuterade vad som skulle behöva ändras för att få programmet att kunna köras. Vi lade till kommentarer vid de saker vi skulle behöva fixa, samt att vi delade upp de metoder som behövde kodas till var och en i gruppen så att vi fick varsin metod att fixa till.

Vi hade i början lite strul med det InvalidAnswerException som låg färdigt i projektet och vi testade olika sätt för att försöka få det att fungera som vi ville. Vi konstaterade snart att det skulle gå att göra precis samma sak, fast utan detta InvalidAnswerException. Vi bestämde oss därmed för att ta bort det, och istället lägga en Try/Catch. Inne i Try-blocket placerade vi dels en IF-sats som kontrollerar användarens inmatning, för att säkerställa att användaren väljer ett menyval som finns (1-6). Och vi valde även att försöka fånga upp användarens inmatning av menyval för att säkerställa att användaren enbart matar in siffror.  Vi hade därmed säkrat upp att en felaktig inmatning från användaren i huvudmenyn inte skulle resultera i ett Runtime Error. Därmed kunde vi även ta bort den listan som lagrade siffror för varje menyval eftersom den nu var överflödig.

Efter lite diskussion i gruppen valde vi även att lägga till metoden **checkInput()**. Detta gjorde vi för att slippa lägga in en Try/Catch i varje metod som tar in ett tal från användaren. Vi ville undvika upprepning utav kod och tyckte att det såg mycket prydligare ut på detta viset. När vi hade implementerat denna metod hade vi även försäkrat oss om att inga Runtime Errors kunde ske utanför huvudmenyn.

Vi lade även till en liten While-loop i **handleDivision()**-metoden för att säkerställa att programmet ej skulle krascha om användaren skulle få för sig att dela med 0.

Efter detta började vi kika lite mer på mindre skönhetsingrepp. Vi lade till ”\n” i de metoder som hanterar användarens inmatning av tal för att få till någon form av radbrytning. Detta gjorde vi eftersom det såg lite rörigt ut i terminalen, och vi ville få till ett mellanrum då man hoppade bland menyvalen.
Vi bytte även ut **System.out.println()** mot **System.out.print()** på de ställen där vi ansåg att det skulle bli snyggare i terminalen.

Då vi arbetade med att få till felhantering i huvudmenyn så uppstod lite fel både till höger och vänster. Detta löste vi dock genom att använda oss utav Debuggern och stega igenom vad som faktiskt hände. Snart så kunde vi lokalisera problemen och åtgärda dem.

Det vi möjligtvis hade kunnat göra annorlunda är att använda oss av Exceptions vi skapat själva, så som den InvalidAnswerException som låg i projektet vid start.

<ins>Resonera kring hur Unit-tester kan vara till nytta, i det aktuella projektet och i allmänhet.</ins>  
Unit-tester kan vara till nytta då de automatiskt kontrollerar att den kod man skrivit faktiskt utför det man vill att den ska utföra, istället för att man manuellt får kontrollera det. I vårt projekt ligger det ett Unit-test för varje metod som gör uträkningarna i programmet. Dessa Unit-tester kontrollerar att tex metoden **add()** returnerar 10, om vi skriver in 5 + 5. Om metoden inte skulle returnera 10, som vi förväntar oss att den ska göra, så går inte testet igenom och vi får ett felmeddelande som visar vad metoden faktiskt returnerade. Vi kan sedan lokalisera felet och åtgärda det så att vi får det utfall vi vill ha.


Unit-tester kan vara till stor nytta om man vill skriva kvalitativ kod som håller standarden redan från början. Vissa skriver Unit-tester redan innan de skriver själva koden för programmet eftersom de då sparar in tiden de hade behövt lägga ner på felsökning. 

