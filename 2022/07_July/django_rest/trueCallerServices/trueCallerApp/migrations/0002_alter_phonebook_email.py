# Generated by Django 4.0.5 on 2022-07-06 12:56

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('trueCallerApp', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='phonebook',
            name='email',
            field=models.CharField(max_length=30),
        ),
    ]
