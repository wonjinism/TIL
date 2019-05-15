(function(){
    // Initialize Firebase
    var config = {
    apiKey: "AIzaSyBgNcdD75pwlziKGeSRgTDT3kH4hDvO2io",
    authDomain: "realtime-db-web-practice.firebaseapp.com",
    databaseURL: "https://realtime-db-web-practice.firebaseio.com",
    projectId: "realtime-db-web-practice",
    storageBucket: "realtime-db-web-practice.appspot.com",
    messagingSenderId: "393936514150"
    };
    firebase.initializeApp(config);

    // Get elements
    const preObject = document.getElementById('object');
    const ulList = document.getElementById('list');

    // Create reference
    const dbRefObject= firebase.database().ref().child('Object');
    const dbRefList = dbRefObject.child('hobbies');

    // Sync object changes
    dbRefObject.on('value', snap => console.log(snap.val()));
    dbRefObject.on('value', snap => {
        preObject.innerText = JSON.stringify(snap.val(), null, 3);
    });

    // Sync list changes
    dbRefList.on('child_added', snap => {
        const li = document.createElement('li');
        li.innerText = snap.val();
        li.id = snap.key;
        ulList.appendChild(li); 
    });

    dbRefList.on('child_changed', snap => {
        const liChanged = document.getElementById(snap.key);
        liChanged.innerText = snap.val();
        
    });

    dbRefList.on('child_removed', snap => {
        const liToRemove = documetn.getElementById(snap.key);
        liToRemove.remove();
    });

}());