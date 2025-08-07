from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/login', methods=['GET'])
def login():
    return render_template('login.html')

@app.route('/welcome', methods=['POST'])
def welcome():
    username = request.form.get('username')
    email = request.form.get('email')
    return render_template('welcome.html', username=username, email=email)

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)