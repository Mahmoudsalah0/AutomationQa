Prereq :

To select Random User / List 
* 
* pm.collectionVariables.set ("randomNum", _.random (1,12));

To Create € insert put this in the body of the request 

* {
    "name": "{{$randomFirstName}}",
    "job": "{{$randomJobTitle}}"
}

