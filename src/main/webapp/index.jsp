<html>
<script src="https://cdn.jsdelivr.net/sockjs/1/sockjs.min.js"></script>
<script type="text/javascript">
    /*var  wsServer = 'ws://127.0.0.1:8080/test/hello';
     var  websocket = new WebSocket(wsServer);
     websocket.onopen = function (evt) { onOpen(evt) };
     websocket.onclose = function (evt) { onClose(evt) };
     websocket.onmessage = function (evt) { onMessage(evt) };
     websocket.onerror = function (evt) { onError(evt) };
     function onOpen(evt) {
     console.log("Connected to WebSocket server.");
     }
     function onClose(evt) {
     console.log("Disconnected");
     }
     function onMessage(evt) {
     console.log('Retrieved data from server: ' + evt.data);
     }
     function onError(evt) {
     console.log('Error occured: ' + evt.data);
     }*/

    var sock = new SockJS('http://127.0.0.1:8080/hello');
    sock.onopen = function() {
        console.log('open');
        console.log('start sending test');
        sock.send('test');
        console.log('after sending test');
        setTimeout(function(){sock.send('later');},3000);
    };
    sock.onmessage = function(e) {
        console.log('message', e.data);
    };
    sock.onclose = function() {
        console.log('close');
    };
</script>
<body>
<h2>Hello World!</h2>

</body>
</html>
