# Read Me First
The following was discovered as part of building this project:

- This is the change listener project for stream-rethink db project
- for changes done in rethink db , it is expected that this will print changes done in the table
- Sample output data 
- {new_val={ROLE_ID=R101NEW, USER_ID=101, id=1c5d0840-456e-47ea-86ae-b78f231229a7}, old_val=null}
- {new_val={ROLE_ID=R101UPDT2, USER_ID=101, id=92aadb61-64d5-4ea0-8183-135911fcc933}, old_val={ROLE_ID=R101UPDT, USER_ID=101, id=92aadb61-64d5-4ea0-8183-135911fcc933}}
- {new_val=null, old_val={ROLE_ID=R104, USER_ID=102, id=c9a2fa4f-f1aa-4fd2-8548-5cbdcc963a34}}

# Getting Started
 - Start Rethink DB F:\Amit\Softwares\rethinkdb-2.4.3>rethinkdb.exe
 - Start Application - it will run on 9091 port
 - Check URL - http://localhost:9090/userRoles
 - Db will run on localhost:8080

## Data Explorer
 - r.db('auth').table('USER_ROLE')
