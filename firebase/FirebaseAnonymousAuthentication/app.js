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

    // Get Elements 
    const btnLogin = document.getElementById('btnLogin');
    const btnLogout = document.getElementById('btnLogout');

    // Click login event listener
    btnLogin.addEventListener('click', e =>{
        firebase.auth().signInAnonymously();
    });

    // Click logout event listener
    btnLogout.addEventListener('click', e => {
        firebase.auth().signOut();
    });

    // Auth listener
    firebase.auth().onAuthStateChanged(firebaseUser => {
        console.log(firebaseUser);
        if(firebaseUser){
            btnLogout.classList.remove('hide');
            console.log(firebaseUser.uid);
        }else{
            btnLogout.classList.add('hide');
        }
    });

    

}());