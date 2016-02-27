//lets require/import the HTTP module
var http = require('http');

//Lets define a port we want to listen to
const PORT=8080; 

//We need a function which handles requests and send response
function handleRequest(request, response){
    response.end('It Works!! Path Hit: ' + request.url);
}

//Create a server
var server = http.createServer(handleRequest);

//Lets start our server
server.listen(PORT, function(){
    //Callback triggered when server is successfully listening. Hurray!
    console.log("Server listening on: http://localhost:%s", PORT);
});

<ul id="list>
  <li>khaleesi(21) </li>
   <li> lucky (7) </li>
   <li> mocha (10.5)</li>
   <li> weta (77)</li>
   <li> ruck (10.5)</li>
</ul>


var transform = {'tag':'li,html':"${name} (${age})'}

var data= [
	{'name':'khalseesi','age':21},
	{'name':'lucky','age':7},
	{'name':'mocha','age':10.5},
	{'name':'weta', 'age':77},
	{'name':'ruck', 'age':10.5}
	];
	json2html.transform{data,transform};
	


