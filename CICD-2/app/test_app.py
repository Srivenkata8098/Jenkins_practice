from app import app

def test_login_page():
    response = app.test_client().get('/login')
    assert response.status_code == 200
    assert b"username" in response.data
    assert b"email" in response.data

def test_welcome_page():
    response = app.test_client().post('/welcome', data={'username': 'Alice', 'email': 'alice@example.com'})
    assert response.status_code == 200
    assert b'Alice' in response.data
    assert b'alice@example.com' in response.data