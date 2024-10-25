def add_contact(list_of_first_names,list_of_last_names,list_of_phone_numbers):

	phone_number =""
	while len(phone_number) != 11:
		first_name = input("Enter your First Name")
		last_name = input("Enter your last Name")
		phone_number = input("Enter your Phone Number")

		if len(phone_number) != 11:
			print("Invalid Number")
			print(" ")

	list_of_first_names.append(first_name)
	list_of_last_names.append(last_name)
	list_of_phone_numbers.append(phone_number)
		

	print(list_of_first_names," ",list_of_last_names," ",list_of_phone_numbers)







def phone_book():
	list_of_first_names = []
	list_of_last_names = []
	list_of_phone_numbers = []


	print('''

	Afeez Phonebook Menu

	1.> Add contact
	2.> Remove contact
	3.> Find contact by phone number
	4.> Find contact by first name
	5.> Find contact by last name
	6.> Edit contact

	0.> Exit

	''')


	choice = input("Select an option: ")




	match choice:
		case "1":
			add_contact(list_of_first_names,list_of_last_names,list_of_phone_numbers)
			phone_book()

		case "2":
			print(list_of_first_names," ",list_of_last_names," ",list_of_phone_numbers)

		case _:
			print("wrong choice")
	

phone_book()



