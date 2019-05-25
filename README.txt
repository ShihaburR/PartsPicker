To enter the profile page and buildPC page

HTML: All files in src -> main -> resources -> templates
CSS: Files in src -> main -> resources -> static -> css
JavaScript: Files in src -> main -> resources -> static -> js
Some css and Javascript was used inline with the html code

Validation Behaviour: On register.html, first name and last name only accept letters no numbers,
Password can only be between 8-26 characters, Email must contain @ symbol and be in format text@text.
When entered an invalid login credentials, they are denied access to profile.html

client side js: When entering details on a buliding a new PC, an autocomplete form is created for CPU, GPU and Case,
allowing the user to select any recommended CPU,GPU and case from an array i created in js.

database writes: register.html (adding the user information onto the database)
buildPC.html (adding the specifications of the user's built PC)

database reads: 
madePC.html (displaying all of the built PCs users on the website have made)
profile.html (displaying the current user information and checking if user matches credentials in database)
buildPC.html (checking if the user matches credentials in the database)

security: TLS and HTTPS and BCrypt and Certifications have been implemented. Certificate is called tls-PartsPicker.jks 
found in (src -> main -> resources)
