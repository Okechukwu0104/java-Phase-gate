const promptsync = require("prompt-sync");


let contact_details = []

function addContacts(contact_details){

	try(
		let search = input("Input a phone number you want to find: ")
		for contact in contact_details:
			if search == contact['phone_number']{
			print(f"Contact found: {contact['first_name']} {contact['last_name']} - {contact['phone_number']}")
				
			}else{
				print("Number not found");
				}

	catch(error){console.log("An error occoured: " error.message);}

}


function phone_book():
	
	console.log('''

	** Afeez Phonebook ** 

	1.> Add contact
	2.> Remove contact
	3.> Find contact by phone number
	4.> Find contact by first name
	5.> Find contact by last name
	6.> Edit contact
	
	-1.> display contacts
	0.> Exit

	''')


	let choice = input("Select an option: ");


	match choice{
		case "1":
			add_contact(contact_details)
			phone_book()

		case "2":
			remove_contact(contact_details)
			phone_book()

		case "3":
			find_number(contact_details)
			phone_book()

		case "4":
			find_first_name(contact_details)
			phone_book()

		case "5":
			find_last_name(contact_details)
			phone_book()


		case "6":
			edit_contact(contact_details)
			phone_book()


		case "-1":
			for contacts in contact_details:
				print(f"{contacts['first_name']} {contacts['last_name']} - {contacts['phone_number']}")
				phone_book()

		case "0":
			print(" ")
		case _:
			print("wrong choice")
	}


