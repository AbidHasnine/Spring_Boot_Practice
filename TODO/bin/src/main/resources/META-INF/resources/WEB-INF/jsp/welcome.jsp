<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .welcome-container {
            background: white;
            padding: 50px;
            border-radius: 5px;
            text-align: center;
            max-width: 600px;
            border: 1px solid #ddd;
        }

        h1 {
            font-size: 32px;
            margin-bottom: 15px;
            color: #333;
        }

        p {
            font-size: 18px;
            color: #666;
            margin-bottom: 30px;
            line-height: 1.6;
        }

        .button-group {
            display: flex;
            gap: 15px;
            justify-content: center;
        }

        a {
            padding: 12px 30px;
            background: #667eea;
            color: white;
            text-decoration: none;
            border-radius: 3px;
            font-size: 16px;
            transition: background 0.3s;
        }

        a:hover {
            background: #5568d3;
        }
    </style>
</head>

<body>
    <div class="welcome-container">
        <h1>Welcome!</h1>
        <p>Hello! Thanks for visiting our application. Get started by logging in or signing up below.</p>
        <div>Name: ${name}</div>
        <div>Password: ******</div>
    </div>
</body>

</html>