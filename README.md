Prompt C:
mainscreen.html, lines 14 and 20, changed title and H1 to "Bob's Cars and Parts"
mainscreen.html, line 62, Changed H2 "Products" to "Cars for sale"
mainscreen.html, lines 28-34 and 65-70, Added data list and options for input of products(Cars) and parts

Prompt D:
mainscreen.html, line 21, added link to about.html
in static folder, created about.html 
about.html, lines 1-12 created about page
about.html, line 7, created a link to homepage 

Prompt E:
BootStrapData.java, lines 64-109, create sample inventory
BootStrapData.java, line 64, confirms sample data only created when both lists are empty

Prompt F:
mainscreen.html, line 100, added product buy now button
AddProductController.java, lines 125-138, added code to buy product
AddProductController.java, line 131, decrement inventory by 1
AddProductController.java, line 134 to 136, inform buyer if they bought the product or not
in templates folder, added confirmationbuypart.html and failbuypart.html
REVISION: updated failbuypart.html and confirmbuypart.html, lines 5-7 and 11, 
"buy now" button now auto directs to mainscreen page with inventory correctly decremented
and alerts user of success/failure.

Prompt G:
Part.java, lines 33, 34, 45 to 60, added min and max attributes
Part.java, lines 90 to 104, added getters and setters for min and max
BootStrapData.java, lines 87 to 112, set min and max inventory to sample parts
InhousePartForm.html, lines 26 to 27, added min and max inputs
OutsourcedPartForm.html, lines 26 to 27, added min and max inputs
mainscreen.html, lines 47,48,57,58, added min max fields to table
application.properties, line 6, renamed database (added a "3" on the end)

Prompt H and Prompt G step 5:
part.java, lines 29, 31, 34, 36, added @Max and @Min annotations
InhousePartForm.html, lines 27, 29, added error checking for min and max
OutsourcedPartForm.html, lines 28, 30, added error checking for min and max
In validators folder, created MaxpartsValidator, MinPartsValidator, ValidMaxParts, and ValidMinParts

Prompt I:
PartTest.java, lines 104 to 120, added unit test for setMin and unit test for setMax

Prompt J:
in validators folder, deleted EnufPartsValidator.java and ValidEnufParts.java
Product.java, line 3, delete import for ValidEnufParts
Product.java, line 21, deleted annotation for @ValidEnufParts
