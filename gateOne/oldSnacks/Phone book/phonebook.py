contact_details = []


def add_contact(contact_details):

	phone_number =""
	while len(phone_number) != 11:
		first_name = input("Enter your First Name")
		last_name = input("Enter your last Name")
		phone_number = input("Enter your Phone Number")

		if len(phone_number) != 11:
			print("Invalid Number")
			print(" ")
		holder = first_name, last_name , phone_number
	contact_details.append(holder)

	print("contact saved successfully...")
		
	return contact_details





def remove_contact(contact_details):
	try:

		count = 1
		for contact in contact_details:
			print(count,". ",contact)
			count += 1

		index = int(input(f'input a number you want to delete(1 - {count-1} ) : '))
		
		contact_details.pop(index - 1)

		return contact_details
	
	except:
		print("wrong input")
	
	








def phone_book():
	
	print('''

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


	choice = input("Select an option: ")




	match choice:
		case "1":
			add_contact(contact_details)
			phone_book()

		case "2":
			remove_contact(contact_details)
			phone_book()


		case "-1":
			print(contact_details)
			phone_book()

		case _:
			print("wrong choice")
	

phone_book()



