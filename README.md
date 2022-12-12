# Emporium - A Marketplace for all

---

### What does Emporium do?
Domain: Market Place for items

#### There are 4 Enterprises in this application. Their organisations are described alongside.

1. `Supervisor`: The Supervisor enterprise will govern and monitor overall operation, where it will keep a track of how much of a stuff was supplied from supplier enterprise to the consumer. It has 2 organizations under him supervisor admin and supervisor manager.
    -    `Supervisor admin` : This role will be assigned to a supervision authority like mayor or equivalent person who can monitor if all the process is going on seamlessly and the supply is reaching to the actual consumer or not. Additionally he has task to assign a supervisor manager.
    -    `Supervisor manager` : This role will keep track of all the invoice and other records to check everything is working properly.

2.`Consumer`: The consumer is the last enterprise in the entire process. Consumer will place an order for a particular item from the list of available item provided by the supplier. Consumer has 3 organizations under him which are admin, manager and worker
    -    `Consumer Admin` : He will monitor the entire operation and will assign consumer managers for the tasks.
    -    `Consumer Manager` : This organisation will keep track of supplies and will place and order for required items. This role will also look after the invoices for the items. He can even raise a request for the items so that any supplier can fullfill that request. This role will also assign Consumer worker for the job
    -    `Consumer worker` : This organisation has a task to go and pick the order placed by the consumer manager.

3. `Supplier`: The Supplier Enterprise will raise a request of the extra items available and the items they wish to sell or donate to the community. These items can be viewed by the consumers who are in need for those items. Supplier can also put a cost for the particular items. There are 3 organisations under the supplier enterprise which are admin, manager and worker.
    -    `Supplier Admin` : This organisation wil monitor the availability of the items and has access to create a Supplier managers and assign work to them.
    -    `Supplier Manager` : This organisation has task to keep track of the items under that particular organization and make a decision of what items are in excess and can be given out. This role also can put a cost for items in the organizations which are going to be given out. This role will also assign a worker for the job.
    -    `Supplier Worker` : The organisation of this role is to provide the items to the logistic enterprise.

4. `Logistic`: The main role of logistic enterprise is to provide easy supply of item from supplier to the consumer. This entity will look after all the logistics involved in suppling items and can also charge for the service. It has 3 roles under it which are admin, manager and worker.
    -    `Logistic Admin` : This role will have task to look after all the oders and assign a manager for the orders.
    -    `Logistic Manager` : This role will have tasks to collect all the orders and assign the workers for the orders.
    -    `Logistic worker` : This entity will have task to supply item from supplier to the consumer.

#### Below is the Class Diagram: 
<img width="1144" alt="image" src="https://user-images.githubusercontent.com/113070179/206957215-68f3fc61-d10f-4e09-a5af-edaaeaf531ed.png">


