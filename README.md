# Cinema
Cinema  is a simple e-Ticket booking application built with Spring Boot.

How to run it?

cd cinema

cinema> mvn clean install

cinema> mvn spring-boot:run

Now you can access Cinema REST CRUD at https://localhost:8080/

### Creating a New Record:
/booking/create?psngrName=Prabhakar Jha&departure=Pune&destination=Noida
It will create new records with an auto-generated ID.

e.g. 
http://localhost:8080/booking/create?psngrName=Prabhakar Jha&destination=USA&departure=Delhi

{"bookingId":1,"psngrName":"Prabhakar Jha","departure":"Delhi","destination":"USA","travelDate":1493211934000}

### Reading a Record:
/booking/read?bookingId=[bookingId]

e.g.
http://localhost:8080/booking/read?bookingId=1
{"bookingId":1,"psngrName":"Prabhakar Jha","departure":"Delhi","destination":"USA","travelDate":1493211934000}

### Updating a New Record:
/booking/update?bookingId=[bookingId]&psngrName=Sweety 
It will Update the booking for a given booking id.

e.g.
http://localhost:8181/booking/update?bookingId=1&psngrName=Suresh

{"bookingId":1,"psngrName":"Suresh","departure":"Delhi","destination":"USA","travelDate":1493211934000}

### Deleting a Record:
/booking/delete? bookingId=[bookingId]
It will Delete a booking for given booking id.

e.g:
http://localhost:8181/booking/delete?bookingId=5
booking #5 deleted successfully



